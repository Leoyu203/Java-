
let allJail = [];
 
async function init() {
  let link = "https://potential-doodle-9759v5v7gjr5376w-8500.app.github.dev/";
  let route = "jail";
 
  try {
    let response = await fetch(link + route);
    allJail = await response.json();
    console.log(allJail);
    displayJail(allJail);
  } catch (error) {
    document.getElementById("output").innerHTML = "<p class='error-msg'>Could not load jail data. Is the server running?</p>";
    console.error("Error fetching data:", error);
  }
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
      <div class="jail-card">
        <h3>${p.fname} ${p.lname}</h3>
        <p>Conviction:${p.conviction}</p>
        <p>Entered:${p.tenter}</p>
        <p>Exit: ${p.texit}</p>
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

