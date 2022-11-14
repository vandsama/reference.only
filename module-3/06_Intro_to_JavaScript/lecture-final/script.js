/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
    console.log("creating variables");
    const a = 0;
    let b = 0;
    // a = 1; cannot do this!
    b = null;
    let c = [1, 2, 3, "hello", "world"];
    console.log(c);
    const myObj = { foo: "hello", bar: "world" };
    myObj.more = "1234";
    myObj["more"] = 4567;
    console.log(myObj);

    console.log(typeof (variables));

    b = 1234;
    console.log({ b, a });
    // console.table(c);
    // console.table(myObj);
}

function doingMath() {
    console.log(2 + 2);
    console.log("hello" + " world");
    console.log(1 + "2");
    console.log(10 - 2);
    console.log("10" - 2);
    console.log("10" * 2);
}

function stringFormatting() {
    const a = 1;
    const b = 2;
    const r = `here are the values ${a} and ${b}`;
    console.log(r);
}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
    console.log(`The value of param1 is ${param1}`);
    console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
    console.log(1 == 1);
    console.log(1 == 2);
    console.log(1 == "1");
    console.log("1" == 1);
    console.log("1" === 1);

    let a;
    console.log(a === undefined);
    a = null;
    console.log(a === null);

    const b = 2;
    console.log(typeof (b));
    if (b) {
        console.log("I'm here!");
    }

    const d = 1;
    if (d) {
        console.log("here");
    }

    const e = 3;
    console.log(!!e);

}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
    if (x) {
        console.log(`${x} is truthy`);
    } else {
        console.log(`${x} is falsy`);
    }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {

    const me = {
        lastName: "mouse",
        firstName: "micky"
    };
    me.age = 99;
    delete me.age;
    me["age"] = 95;

    me.address = {
        street: "1776 Mentor",
        city: "cincinnati",
        state: "oh"
    }

    console.log(me);
    console.log(me.nope);
    console.log(me["nope"]);
}


function builtInfunctions() {
    console.log(Math.abs(-2));
    console.log(Math.ceil(2.34));
    console.log(Math.floor(2.34));
}

function builtInStringFunctions() {
    console.log("helloworld".endsWith("world"));
    console.log("dog".startsWith("d"));
    console.log("dog".substring(0, 2));
}

function workingWithArrays() {
    let arr = [1, 2, 3];
    console.log(arr);
    arr.push(4);
    console.log(arr);
    console.log(arr.pop());
    console.log(arr);

    arr.unshift(0);
    console.log(arr);
    console.log(arr.shift());
    console.log(arr);


}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function add(num1, num2) {
    return num1 + num2;
}

function add(num1, num2, num3) {
    console.logx("in add with 3 parameters");

    let p3 = 0;
    if (num3) {
        p3 = num3;
    }

    return num1 + num2 + p3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
    console.log("Math.PI : " + Math.PI);
    console.log("Math.LOG10E : " + Math.LOG10E);
    console.log("Math.abs(-10) : " + Math.abs(-10));
    console.log("Math.floor(1.99) : " + Math.floor(1.99));
    console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
    console.log("Math.random() : " + Math.random());

    console.log(add(1, 2));


}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
    console.log(`.length -  ${value.length}`);
    console.log(`.endsWith('World') - ${value.endsWith("World")}`);
    console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
    console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

    /*
      Other Methods
          - split(string)
          - substr(number, number)
          - substring(number, number)
          - toLowerCase()
          - trim()
          - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
      */
}
