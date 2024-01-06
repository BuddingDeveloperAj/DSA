const array = [5, 7, 7, 8, 8, 10]
const target = 8
/**
 *ans is [3,4]
 */

console.log(orderAgnosticBS(array, target, true), orderAgnosticBS(array, target, false))

function orderAgnosticBS(arr, target, asc) {
    let start = 0
    let end = arr.length - 1
    let ans = -1

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)

        if (arr[mid] < target) {
            start = mid + 1
        }
        else if (arr[mid] > target) {
            end = mid - 1
        }
        else {
            ans = mid
            if (asc) {
                end = mid - 1
            }
            else {
                start = mid + 1
            }
        }
    }
    return ans
}
