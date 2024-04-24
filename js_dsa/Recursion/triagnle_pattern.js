const height = 5;

function triangle(r) {
    if (r == 0) {
        return;
    }

    triangle(r - 1);
    console.log('*'.repeat(r));
}

triangle(height);
