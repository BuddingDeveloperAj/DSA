var equalSubstring = function (s, t, maxCost) {
    let ans = -1;
    let window = 0;
    let left = 0;

    for (let right = 0; right < s.length; right++) {
        window += Math.abs(s.charCodeAt(right) - t.charCodeAt(right));

        while (window > maxCost) {
            window -= Math.abs(s.charCodeAt(left) - t.charCodeAt(left));
            left++;
        }
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
};

let s = 'abcd';
let t = 'bcdf';
let maxCost = 3;

console.log(equalSubstring(s, t, maxCost));
