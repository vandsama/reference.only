// add pageTitle

pageTitle = 'My Shopping List';

// add groceries

groceries = [{
  id: 1,
  item: 'firstItem'
},
{
  id: 2,
  item: 'secondItem'
},
{
  id: 3,
  item: 'thirdItem'
},
{
  id: 4,
  item: 'fourthItem'
},
{
  id: 5,
  item: 'fifthItem'
},
{
  id: 6,
  item: 'sixthItem'
},
{
  id: 7,
  item: 'seventhItem'
},
{
  id: 8,
  item: 'eighthItem'
},
{
  id: 9,
  item: 'ninthItem'
},
{
  id: 10,
  item: 'tenthItem'
}
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const heading = document.getElementById('title');
  heading.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceryList = document.getElementById('groceries');
  for (grocery of groceries) {
    const li = document.createElement('li');
    li.innerText = grocery.item;
    groceryList.appendChild(li);
  }
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const allGroceryItems = document.querySelectorAll('li');
  allGroceryItems.forEach((g) => {
    g.classList.add('completed')
  })


}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
