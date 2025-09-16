function editProfile() {
  const nameElement = document.getElementById("name");
  const newName = prompt("Enter your new name:");
  if (newName) {
    nameElement.textContent = newName;
  }
}

function handleRequest(icon, name = null, avatar = null) {
  const listItem = icon.closest(".card-list-item");
  if (listItem) {
    listItem.remove();

    // Decrease request count
    const requestCount = document.getElementById("request-count");
    let count = parseInt(requestCount.textContent);
    requestCount.textContent = count > 0 ? count - 1 : 0;

    // If accepted, add to connections
    if (icon.alt === "accept" && name && avatar) {
      const connectionList = document.getElementById("connection-list");
      const newConnection = document.createElement("li");
      newConnection.className = "card-list-item start";
      newConnection.innerHTML = `<img src="${avatar}" alt="${name}" class="avatar-s" /> ${name}`;
      connectionList.appendChild(newConnection);

      // Increase connection count
      const connectionCount = document.getElementById("connection-count");
      let connCount = parseInt(connectionCount.textContent);
      connectionCount.textContent = connCount + 1;
    }
  }
}
