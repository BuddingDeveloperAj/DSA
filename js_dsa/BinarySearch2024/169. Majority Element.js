const majorityElement = (nums) => {
  let count = 0;
  let candidate = nums[0];

  for (let n of nums) {
    if (count == 0) candidate = n;

    if (n == candidate) count++;
    else count--;
  }
  return candidate;
};

console.log(majorityElement([2, 2, 1, 1, 1, 2, 2, 1, 1, 1]));
