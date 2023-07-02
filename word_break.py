class Solution:
    s = "cars"
    wordDict = ["car","ca", "rs"]
    index = 0
    presence_checker = 0
    while True:
        if wordDict[index] not in s:
            presence_checker += 1 
            if presence_checker == len(wordDict):
                break
        else:
            word = wordDict[index]
            index = s.find(word)
            s = s[len(word):]
            presence_checker = 0 
        if index == len(wordDict) - 1:
            index = 0 
        else:
            index += 1 
    if len(s) > 0: 
        print((s))
        print(False)
    else:
        print(True)


