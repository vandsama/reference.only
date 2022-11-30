

// sync
console.log('hello');
console.log('there');
console.log('world');

console.log("==========");

console.log('hello');
doDelay(1500).then(() => {
    console.log('there');
});
console.log('world');

const p = doDelay(500);
p.then((r) => {
    console.log(r);
});

// Element.addEventListener('click', (event)=>{});

doDelay(500, true)
    .then(() => { console.log('wont happen'); })
    .catch(() => { console.log('some error happen'); });

/**
 * factory function to produce a promise that 
 * resolves or rejects after a given number of 
 * milliseconds
 * @param {Number} waitInMS - delay in milliseconds
 * @param {Boolean} shouldErr - TRUE if the promise should reject; 
 *                              otherwise the promise will resolve. defaults to FALSE
 */
function doDelay(waitInMS, shouldErr = false) {
    return new Promise(
        (resolveFn, rejectFn) => setTimeout(shouldErr ? rejectFn() : resolveFn(new Date()), waitInMS)
    );
}
