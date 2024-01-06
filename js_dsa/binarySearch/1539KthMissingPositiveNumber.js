const array = [2, 3, 4, 7, 11]
const k = 1

function main(arr, k) {
    let start = 0
    let end = arr.length - 1

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)

        if (arr[mid] - mid - 1 < k) {
            start = mid + 1
        }
        else {
            end = mid - 1
        }
    }
    return k + start
}

console.log(main(array, k))