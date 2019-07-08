import Cocoa

var str = "-1, 17, 1004, 12, 208, 0, -4789, -37"

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

for x in 0..<str.count {
    
    print ( getSubstring(phrase: str, start: x, stop: x + 1))
}

func firstNum (str:String) -> String {
    
    for x in 0...str.count {
        let letter = getSubstring(phrase: str, start: x, stop: x + 1)
        
        if  letter == "," {
            return getSubstring(phrase: str, start: 0, stop: x)
        }
    }
    
    return str
}


let data = firstNum(str: str)

print ("The first num is \(data ) " )

