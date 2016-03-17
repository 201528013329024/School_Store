function GEId(sID)
{
    try{return document.getElementById(sID)}catch(e){};
}

function EvalPwd(sP)
{
    var aPQ=new Array(6);
    if(ClientSideStrongPassword(sP,gSimilarityMap,gDictionary))
    {
        aPQ=["#0c6","#0c6","#0c6","#0c6","#0c6","#000"];
    }
    else if(ClientSideMediumPassword(sP,gSimilarityMap,gDictionary))
    {
        aPQ=["#ff9","#ff9","#F1F1F1","#ff9","#000","#adadad"];
    }
    else if(ClientSideWeakPassword(sP,gSimilarityMap,gDictionary))
    {
        aPQ=["#f00","#F1F1F1","#F1F1F1","#000","#adadad","#adadad"];
    }
    else
    {
        aPQ=["#F1F1F1","#F1F1F1","#F1F1F1","#adadad","#adadad","#adadad"];
    }
    var oW=GEId("iWeak").style;
    var oM=GEId("iMedium").style;
    var oS=GEId("iStrong").style;
    oW.background=aPQ[0];
    oM.background=aPQ[1];
    oS.background=aPQ[2];
    oW.color=aPQ[3];
    oM.color=aPQ[4];
    oS.color=aPQ[5];
}


var kNoCanonicalCounterpart = 0;
var kCapitalLetter = 0;
var kSmallLetter = 1;
var kDigit = 2;
var kPunctuation = 3;
var kAlpha =  4;
var kCanonicalizeLettersOnly = true;
var kCananicalizeEverything = false;
var kDebugTraceLevelNone = 0;
var kDebugTraceLevelSuperDetail = 120;
var kDebugTraceLevelRealDetail = 100;
var kDebugTraceLevelAll = 80;
var kDebugTraceLevelMost = 60;
var kDebugTraceLevelFew = 40;
var kDebugTraceLevelRare = 20;
var gDebugTraceLevel = kDebugTraceLevelNone;


function CSimilarityMap()
{
this.m_elements = "";
this.m_canonicalCounterparts = "";
}
function SimilarityMap_Add(element, canonicalCounterpart)
{
this.m_elements += element;
this.m_canonicalCounterparts += canonicalCounterpart;
}
function SimilarityMap_Lookup(element)
{
var canonicalCounterpart = kNoCanonicalCounterpart;
var index = this.m_elements.indexOf(element);
if (index >= 0)
{
canonicalCounterpart = this.m_canonicalCounterparts.charAt(index);
}
else
{
}
return canonicalCounterpart;
}
function SimilarityMap_GetCount()
{
return this.m_elements.length;
}
CSimilarityMap.prototype.Add = SimilarityMap_Add;
CSimilarityMap.prototype.Lookup = SimilarityMap_Lookup;
CSimilarityMap.prototype.GetCount = SimilarityMap_GetCount;
function CDictionaryEntry(length, wordList)
{
this.m_length = length;
this.m_wordList = wordList;
}

function CDictionary()
{
this.m_entries = new Array()
}
function Dictionary_Lookup(strWord)
{
for (var index = 0; index < this.m_entries.length; index++)
{
if (this.m_entries[index].Lookup(strWord))
{
return true;
}
}
}
function Dictionary_Add(length, wordList)
{
var iL=this.m_entries.length;
var cD=new CDictionaryEntry(length, wordList)
this.m_entries[iL]=cD;
}
CDictionary.prototype.Lookup = Dictionary_Lookup;
CDictionary.prototype.Add = Dictionary_Add;
var gSimilarityMap = new CSimilarityMap();
var gDictionary = new CDictionary();
function CharacterSetChecks(type, fResult)
{
this.type = type;
this.fResult = fResult;
}
function isctype(character, type, nDebugLevel)
{
var fResult = false;
switch(type)
{
case kCapitalLetter:
if((character >= 'A') && (character <= 'Z'))
{
fResult = true;
}
break;
case kSmallLetter:
if ((character >= 'a') && (character <= 'z'))
{
fResult = true;
}
break;
case kDigit:
if ((character >= '0') && (character <= '9'))
{
fResult = true;
}
break;
case kPunctuation:
if ("!@#$%^&*()_+-='\";:[{]}\|.>,</?`~".indexOf(character) >= 0)
{
fResult = true;
}
break;
case kAlpha:
if (isctype(character, kCapitalLetter) || isctype(character, kSmallLetter))
{
fResult = true;
}
break;
default:
break;
}

return fResult;
}
function CanonicalizeWord(strWord, similarityMap, fLettersOnly)
{
var canonicalCounterpart = kNoCanonicalCounterpart;
var strCanonicalizedWord = "";
var nStringLength = 0;
if ((strWord != null) && (strWord.length > 0))
{
strCanonicalizedWord = strWord;
strCanonicalizedWord = strCanonicalizedWord.toLowerCase();

if (similarityMap.GetCount() > 0)
{
nStringLength = strCanonicalizedWord.length;

for(var index = 0; index < nStringLength; index++)
{
if (fLettersOnly && !isctype(strCanonicalizedWord.charAt(index), kSmallLetter, kDebugTraceLevelSuperDetail))
{
continue;
}

canonicalCounterpart = similarityMap.Lookup(strCanonicalizedWord.charAt(index));
if (canonicalCounterpart != kNoCanonicalCounterpart)
{
strCanonicalizedWord = strCanonicalizedWord.substring(0, index) + canonicalCounterpart +
strCanonicalizedWord.substring(index + 1, nStringLength);
}
}
}
}
return strCanonicalizedWord;
}
function IsLongEnough(strWord, nAtLeastThisLong)
{
if ((strWord == null) || isNaN(nAtLeastThisLong))
{
return false;
}
else if (strWord.length < nAtLeastThisLong)
{
return false;
}

return true;
}
function SpansEnoughCharacterSets(strWord, nAtLeastThisMany)
{
var nCharSets = 0;
var characterSetChecks = new Array(
new CharacterSetChecks(kCapitalLetter, false),
new CharacterSetChecks(kSmallLetter, false),
new CharacterSetChecks(kDigit, false),
new CharacterSetChecks(kPunctuation, false)
);
if ((strWord == null) || isNaN(nAtLeastThisMany))
{
return false;
}

for(var index = 0; index < strWord.length; index++)
{
for(var nCharSet = 0; nCharSet < characterSetChecks.length;nCharSet++)
{
if (!characterSetChecks[nCharSet].fResult && isctype(strWord.charAt(index), characterSetChecks[nCharSet].type, kDebugTraceLevelAll))
{
characterSetChecks[nCharSet].fResult = true;
break;
}
}
}
for(var nCharSet = 0; nCharSet < characterSetChecks.length;nCharSet++)
{
if (characterSetChecks[nCharSet].fResult)
{
nCharSets++;
}
}

if (nCharSets < nAtLeastThisMany)
{
return false;
}

return true;
}
function FoundInDictionary(strWord, similarityMap, dictionary)
{
var strCanonicalizedWord = "";

if((strWord == null) || (similarityMap == null) || (dictionary == null))
{
return true;
}
strCanonicalizedWord = CanonicalizeWord(strWord, similarityMap, kCanonicalizeLettersOnly);

if (dictionary.Lookup(strCanonicalizedWord))
{
return true;
}

return false;
}

function IsCloseVariationOfAWordInDictionary(strWord, threshold, similarityMap, dictionary)
{
var strCanonicalizedWord = "";
var nMinimumMeaningfulMatchLength = 0;

if((strWord == null) || isNaN(threshold) || (similarityMap == null) || (dictionary == null))
{
return true;
}
strCanonicalizedWord = CanonicalizeWord(strWord, similarityMap, kCananicalizeEverything);
nMinimumMeaningfulMatchLength = Math.floor((threshold) * strCanonicalizedWord.length);
for (var nSubStringLength = strCanonicalizedWord.length; nSubStringLength >= nMinimumMeaningfulMatchLength; nSubStringLength--)
{
for(var nSubStringStart = 0; (nSubStringStart + nMinimumMeaningfulMatchLength) < strCanonicalizedWord.length; nSubStringStart++)
{
var strSubWord = strCanonicalizedWord.substr(nSubStringStart, nSubStringLength);

if (dictionary.Lookup(strSubWord))
{
return true;
}
}
}
return false;
}


function ClientSideStrongPassword()
{
return (IsLongEnough(ClientSideStrongPassword.arguments[0], "7") &&
SpansEnoughCharacterSets(ClientSideStrongPassword.arguments[0], "3") &&
(!(IsCloseVariationOfAWordInDictionary(ClientSideStrongPassword.arguments[0], "0.6", 
ClientSideStrongPassword.arguments[1], ClientSideStrongPassword.arguments[2]))));
}

function ClientSideMediumPassword()
{
return (IsLongEnough(ClientSideMediumPassword.arguments[0], "7") &&
SpansEnoughCharacterSets(ClientSideMediumPassword.arguments[0], "2") &&
(!(FoundInDictionary(ClientSideMediumPassword.arguments[0], ClientSideMediumPassword.arguments[1], 
ClientSideMediumPassword.arguments[2]))));
}

function ClientSideWeakPassword()
{
return (IsLongEnough(ClientSideWeakPassword.arguments[0], "6") ||
(!(IsLongEnough(ClientSideWeakPassword.arguments[0], "0"))));
}
