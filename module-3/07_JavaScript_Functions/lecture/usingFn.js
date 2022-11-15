
function incrementArray(arr, inc = 1) {
    const arr2 = [];
    for (const v of arr) {
        arr2.push(v + inc);
    }
    return arr2;
}

function decrementArray(arr) {
    const arr2 = [];
    for(const v of arr) {
        arr2.push(v - 1);
    }
    return arr2;
}

// map
function transformArray(arr, fn) {
    const arr2 = [];
    for (const v of arr) {
        arr2.push(fn(v));
    }
    return arr2;
}

console.log(incrementArray([1, 2, 3]));
console.log(decrementArray([1, 2, 3]));
console.log(incrementArray([1, 2, 3], -1));
console.log(transformArray([1, 2, 3], (v) => v * 2));

console.log([1,2,3].map(v => v * 2));