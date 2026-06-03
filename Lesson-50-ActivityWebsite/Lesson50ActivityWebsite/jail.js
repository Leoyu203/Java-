
let allJail = [];
 
async function init() {
  let link = "https://potential-doodle-9759v5v7gjr5376w-8500.app.github.dev/";
  let route = "jail";
  let response = await fetch(link + route);
  allJail = await response.json();
  displayJail(allJail);
  
 
  
}
 
function displayJail(records) {
  let output = "";
 
  document.getElementById("resultCount").innerText = records.length + " result(s)";
 
  if (records.length === 0) {
    document.getElementById("output").innerHTML = "<p class='no-results'>No records found.</p>";
    return;
  }
 
  for (let i = 0; i < records.length; i++) {
    let p = records[i];
 
    output += `
      <div class="flip-card" onclick="this.classList.toggle('flipped')">
        <div class="flip-card-inner">
        <h3>${p.fname} ${p.lname}</h3>
        <p>Conviction:${p.conviction}</p>
        <p>Entered:${p.tenter}</p>
        <p>Exit: ${p.texit}</p>
      </div>
    </div>
    `;
  }
 
  document.getElementById("output").innerHTML = output;
}
 
function filterPackages() {
  let searchText = document.getElementById("searchInput").value.toLowerCase();
 
  let filtered = allJail.filter(function(p) {
    return p.fname.toLowerCase().includes(searchText) ||
           p.lname.toLowerCase().includes(searchText) ||
           p.conviction.toLowerCase().includes(searchText);
  });
 
  displayJail(filtered);
}

