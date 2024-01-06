var singleNonDuplicate = function (nums = [3, 3, 7, 7, 10, 11, 11]) {
    let start = 0
    let end = nums.length - 1

    while (start < end) {
        let mid = Math.floor(start + (end - start) / 2)
        let isEven = mid % 2 == 0

        if (isEven) {
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 1
            }
            else {
                end = mid
            }
        }
        else {
            if (nums[mid] == nums[mid - 1]) {
                start = mid + 1
            }
            else {
                end = mid
            }
        }
    }
    return nums[start]
};

console.log(singleNonDuplicate())