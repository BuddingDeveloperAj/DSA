var isSubsequence = function (s, t) {
    let i = 0;
    let c = 0;
    while (c < s.length) {
        let start = i;
        let a = s[c];
        let flag = false;

        while (start < t.length) {
            if (a == t[start]) {
                i = start + 1;
                flag = true;
                break;
            }

            start++;
        }

        if (flag) {
            c++;
        } else {
            return false;
        }
    }

    return true;
};

function isSubsequence1(s, t) {
    if (s.length === 0) {
        return true;
    }

    let start = 0;

    for (let i = 0; i < t.length; i++) {
        if (t[i] === s[start]) {
            start++;
        }
        if (start === s.length) {
            return true;
        }
    }

    return false;
}

let s = 'abc';
let t = 'ahbgdc';

console.log(isSubsequence(s, t));
