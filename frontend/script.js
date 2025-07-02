async function fetchMessage() {
  const res = await fetch("https://your-backend-url.onrender.com/api/hello");
  const msg = await res.text();
  document.getElementById("response").textContent = msg;
}
