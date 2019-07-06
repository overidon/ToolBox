var name_0 = "Maxamillion Baldersgate"

print ("Hello my name is, \(name_0)")


func getSubstringFromOffsetToEnd( phrase: String,  stop: Int) {
    
    let start = phrase.index( phrase.startIndex, offsetBy: stop)
    let end   = phrase.index( phrase.endIndex, offsetBy: stop * -1)
    
    let substring1 = phrase[start...end]
    
    print ( substring1)
}




getSubstringFromOffsetToEnd(phrase: name_0, stop: 1)



func getSubstring( phrase: String,  start: Int, stop: Int) -> String {
    
    if ( 0 > start || 0 > stop) {
        return phrase
    }
    
    let front = phrase.index( phrase.startIndex, offsetBy: start)
    let back = phrase.index ( phrase.startIndex, offsetBy: stop )
    
    let substring1 = phrase[front..<back]
   
    // cast as a String before returning...
    return String ( substring1 )
}

print ( name_0)
let str_new = getSubstring(phrase: name_0, start: 4,  stop: 8)

print ( str_new)
