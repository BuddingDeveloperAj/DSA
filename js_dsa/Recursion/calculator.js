var calculate = function (s) {
    let stack = [];
    let result = 0;
    let number = 0;
    let sign = 1;
    for (let i = 0; i < s.length; i++) {
        let c = s[i];

        console.log({
            stack,
            result,
            number,
            sign,
        });

        if (c == ' ') {
            continue;
        }

        if (!isNaN(Number(c))) {
            number = 10 * number + Number(c);
        } else if (c == '+') {
            result += sign * number;
            number = 0;
            sign = 1;
        } else if (c == '-') {
            result += sign * number;
            number = 0;
            sign = -1;
        } else if (c == '(') {
            //we push the result first, then sign;
            stack.push(result);
            stack.push(sign);
            //reset the sign and result for the value in the parenthesis
            sign = 1;
            result = 0;
        } else if (c == ')') {
            result += sign * number;
            number = 0;
            result *= stack.pop(); //stack.pop() is the sign before the parenthesis
            result += stack.pop(); //stack.pop() now is the result calculated before the parenthesis
        }
    }
    if (number != 0) result += sign * number;
    return result;
};

let s = '(1+(4+5+2)-3)+(6+8)';
console.log(calculate(s));
