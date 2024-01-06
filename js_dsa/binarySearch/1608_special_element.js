/**
 * @param {number[]} nums
 * @return {number}
 */
var specialArray = function (nums) {
    let start = 0;
    let end = nums.length;

    while (start <= end) {
        let mid = Math.ceil(start + (end - start) / 2)
        let count = counter(mid, nums)

        if (count == mid) return mid

        if (count < mid) start = mid + 1;
        else end = mid - 1;
    }
    return -1;
};

function counter(mid, nums) {
    let count = 0;

    for (let i of nums) {
        if (i <= mid) count++
    }
    return count;
}
console.log(specialArray([3, 5]))