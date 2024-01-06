/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */

/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function (x) {
  let start = 1;
  let end = Number(x > 1 ? Math.round(Math.floor(x / 2)) : 1);

  while (start <= end) {
    let mid = Math.round(Math.floor(start + (end - start) / 2));

    let res = mid * mid;
    if (res === x) {
      return mid;
    } else if (res > x) {
      end = mid - 1;
    } else start = mid + 1;
  }
  return start - 1;
};

console.log(mySqrt(8));
console.log(mySqrt(10));
console.log(mySqrt(4));
console.log(mySqrt(6));
