var minRemoveToMakeValid = function (s) {
  let start = 0;
  let end = s.length - 1;
  let flag = false;
  let wait_for_start = false;
  let wait_for_end = false;

  while (start <= end) {
    if (s[start] === '(' && s[end] === ')') {
      start++;
      end--;
      flag = false;
      wait_for_start = false;
      wait_for_end = false;
    } else if (s[start] === '(') {
      if (flag && wait_for_start) {
        flag = false;
        start++;
        end--;
      } else if (!flag) {
        flag = true;
        wait_for_end = true;
        end--;
      } else {
        end--;
      }
    } else if (s[end] === ')') {
      if (flag && wait_for_end) {
        flag = false;
        start++;
        end--;
      } else if (!flag) {
        flag = true;
        wait_for_start = true;
        start++;
      } else {
        start++;
      }
    } else {
      start++;
      end--;
    }
  }
  if (flag) {
    if (wait_for_end) {
      console.log(s[start], start, 'to delete');
      let arr = s.split('');
      arr.splice(start, 1);
      return arr.join('');
    } else if (wait_for_start) {
      console.log(s[end], end, 'to delete');
      let arr = s.split('');
      arr.splice(end, 1);
      return arr.join('');
    }
  }
  return s;
};

console.log(minRemoveToMakeValid('a)b(c)d'));
