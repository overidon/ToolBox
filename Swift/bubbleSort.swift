func bubbleSort ( array: [Int]) -> [Int] {
    
    var arr = array
    
    if arr.count <= 1 { return arr }
    
    var done = false;
    
    var count = 0;
    
    while !done {
        
        for var index in 0..<arr.count - 1 {
            
            let left = arr[index]
            let right = arr[index + 1]
            
            if left > right {
                
                arr[index]     = right
                arr[index + 1] = left
                
                count = 0;
                index = 0;
               
            } else {
               
                count += 1;
                if ( count >= arr.count - 1) {
                    done = true;
                    break;
                }
            }
        }
    }

    return arr
    
}
