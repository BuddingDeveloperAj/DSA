var maxRepeating = function (sequence, word) {
    let check = word;
    let count = 0;
    while (sequence.includes(check)) {
        console.log(sequence, 1);
        console.log(check, 2);
        count++;
        check += word;
        console.log(check, 3);
    }
    return count;
};

let str = 'aaabaaaabaaaabaaaabaaaabaaaaba';
let word = 'aaaba';

console.log(maxRepeating(str, word));

// console.log(
//     'aaabaaaabaaaabaaaabaaaabaaaaba'.includes('aaabaaaabaaaabaaaabaaaabaaaaba')
// );
