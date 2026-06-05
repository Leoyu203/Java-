
let allPackages = [];
 
async function init() {
  let link = "https://potential-doodle-9759v5v7gjr5376w-8500.app.github.dev/";
  let route = "search";
  let response = await fetch(link + route);
  allPackages = await response.json();
  displayPackages(allPackages);
 
  
}
 
function displayPackages(bookings) {
  let output = "";
 
  document.getElementById("resultCount").innerText = bookings.length + " result(s)";
 
  if (bookings.length === 0) {
    document.getElementById("output").innerHTML = "<p class='no-results'>No packages found.</p>";
    return;
  }
 
  for (let i = 0; i < bookings.length; i++) {
    let pkg = bookings[i];
 
    output += `
      <div class="flip-card" onclick="this.classList.toggle('flipped')">
        <div class="flip-card-inner">
 
          
          <div class="flip-card-front">
            <h3>Booking Details</h3>
            <p><strong>First Name:</strong> ${pkg.fname}</p>
            <p><strong>Last Name:</strong> ${pkg.lname}</p>
            <p><strong>Destination:</strong> ${pkg.Destination}</p>
            <p><strong>Ship Name:</strong> ${pkg.line}</p>
            <p><strong>Price:</strong> $${pkg.cost}</p>
          </div>
 
        
          <div class="flip-card-back">
            <img src="${pkg.image_url}" alt="${pkg.line}" />
            <p>${pkg.line}</p>
          </div>
 
        </div>
      </div>
    `;
  }
 
  document.getElementById("output").innerHTML = output;
}
 
function filterPackages() {
  let searchText = document.getElementById("searchInput").value.toLowerCase();
 
  let filtered = allPackages.filter(function(pkg) {
    return pkg.line.toLowerCase().includes(searchText);
  });
 
  displayPackages(filtered);
}

