
function add(p1 = 0, p2 = 0) {
    return p1 + p2;
}

// using varargs
function countEven() {
    const args = Array.from(arguments);
    let count = 0;
    for (const a of args) {
        if (a % 2 === 0) {
            count++;
        }
    }
    return count;
}

// using rest parameter
function countEven2(...args) {
    let count = 0;
    for (const a of args) {
        if (a % 2 === 0) {
            count++;
        }
    }
    return count;
}


console.log(add());
console.log(add(5));
console.log(add("a", "B"));

console.log(countEven(1, 2, 4, 6, 8));
console.log(countEven2(1, 2, 4, 6, 8));


