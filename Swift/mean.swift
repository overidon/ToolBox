// find the average
func mean ( arr : [Int], start: Int, stop: Int ) -> Double {
    
    // int
    var total = 0
    
    for x in (start..<stop) {
        // add ints...
        total += arr[x]
    }
    
    print ("The total so far is: \(total)")
    
    return Double(total) / Double(arr.count)
}
