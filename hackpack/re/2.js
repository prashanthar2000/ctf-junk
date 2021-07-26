var x,
y,
dn = Date.now,
rc = function () {
  return Math.floor(107 + 19 * Math.random())
},
rn = new Math.seedrandom('0x42').int32(),
rt = function () {
  let r = Math.floor(1 + 7 * Math.random()),
  e = [
  ];
  for (; r > 0; ) e.push(rc()),
  r--;
  return String.fromCharCode(...e)
},
rr = function (r, e) {
  for (; r > 0; ) e.unshift(e.pop()),
  --r;
  return e.join('')
},
lr = function (r, e) {
  for (; r > 0; ) e.push(e.shift()),
  --r;
  return e.join('')
},
cf = function (r) {
  try {
    let e = Array.from(atob(rr(243, Array.from(r)))),
    n = 1;
    for (let r = 0; r < e.length; r++) r === n && (e.splice(r + 1, + e[r + 1] + 1), n += n);
    return + lr(168, e)
  } catch (r) {
  }
  return - 1
},
c = function () {
  let r = document.getElementById('message').value,
  e = document.getElementById('msg');
  x =  rr,
  y =  lr ,
  cf(r) >= dn() - 60000 ? fetch('/check', {
    method: 'POST',
    mode: 'same-origin',
    cache: 'no-cache',
    headers: {
      'Content-Type': 'application/json'
    },
    referrer: 'no-refferer',
    body: JSON.stringify({
      key: r
    })
  }).then(r=>r.json()).then(r=>{
    r.hasOwnProperty('flag') ? e.innerHTML = 'Congrats! <br/>' + r.flag : e.innerText = 'Nope!!!'
  }).catch (r=>{
    console.error(r)
  })  : e.innerText = 'Nope!!!'
};

