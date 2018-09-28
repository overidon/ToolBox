// imagine that there is an href (LINK) in your index.html or some html file...

// you want to force a click on that specific link without actually making anyone click it

// if the link has an id of 'link_test' ------> 
  
///<a id="link_test" href="https://www.overidon.com">link_test</a>
    
// then from an appropriate place in javascript such as within a button, or more appropriately like a 
// function that normally isn't connected to the UI, you could summon a basic click by doing...

document.getElementById('link_test').click();
