let arr = [2, 3, 5, 9, 14, 17, 18]
let target = 11
//ans = 5


function sol(arr, target) {
    start = 0
    end = arr.length - 1

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)

        console.log(arr[mid], start, mid, end)

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
    return arr[end]
}

console.log(sol(arr, target))