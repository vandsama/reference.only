
function add(a,b) {
    return a + b;
}

const add2 = function (a,b) {
    return a + b;
}

const add3 = function myAdd(a,b) {
    return a + b;
}

// "fat arrow" function
const add4 = (a,b) => {
    return a + b;
}

// evaluate & return an expression
const add5 = (a,b) => a + b;

console.log(`${typeof(add)} ${add(1,1)}`);
console.log(`${typeof(add2)} ${add2(1,1)}`);
console.log(`${typeof(add3)} ${add3(1,1)}`);
console.log(`${typeof(add4)} ${add4(1,1)}`);
console.log(`${typeof(add5)} ${add5(1,1)}`);


console.log("working with methods:")

const obj = {
    add6: function(a, b) {return a + b},
    add7: (a,b) => a + b,
    add8(a,b) {return a + b}
};

console.log(`${typeof(obj.add6)} ${obj.add6(1,1)}`);
console.log(`${typeof(obj.add7)} ${obj.add7(1,1)}`);
console.log(`${typeof(obj.add8)} ${obj.add8(1,1)}`);


// --- returning a function ---
function makeAdder(a) {
    return (x) => x + a;
}

const increaseBy10Function = makeAdder(10); // looks like x => x + 10;
console.log(`${typeof(increaseBy10Function)} ${increaseBy10Function(11)}`);
console.log(makeAdder(10)(11));

// --- pass functions as arguments ---
function acceptFn(fn) {
    return fn(10,11);
}

console.log(acceptFn(add));
console.log(acceptFn(add2));
console.log(acceptFn((a,b) => a + b));