let arr = [2, 3, 5, 9, 14, 17, 18]
let target = 14



function sol(arr, target) {
    start = 0
    end = arr.length - 1

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)
        if (arr[mid] == target) {
            return arr[mid]
        }

        if (arr[mid] < target) {
            start = mid + 1
        }
        else {
            end = mid - 1
        }
    }
    return arr[start]
}

console.log(sol(arr, target))