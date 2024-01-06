/**
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function (n) {
  start = 1;
  end = n;

  while (start <= end) {
    let mid = Math.ceil(start + (end - start) / 2);
    let ans = guess(mid);

    if (ans == 0) {
      return mid;
    }

    if (ans == -1) end = mid - 1;
    else start = mid + 1;
  }
  return -1;
};
