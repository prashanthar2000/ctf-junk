r > th::after {
  display: none;
  width: .8em;
  margin-inline-end: -.8em;
  text-align: end;
}
table[order="asc"] > thead > tr > th::after {
  content: "\2193"; /* DOWNWARDS ARROW (U+2193) */
}
table[order="desc"] > thead > tr > th::after {
  content: "\2191"; /* UPWARDS ARROW (U+2191) */
}
table[order][order-by="0"] > thead > tr > th:first-child > a ,
table[order][order-by="1"] > thead > tr > th:first-child + th > a ,
table[order][order-by="2"] > thead > tr > th:first-child + th + th > a {
  text-decoration: underline;
}
table[order][order-by="0"] > thead > tr > th:first-child::after ,
table[order][order-by="1"] > thead > tr > th:first-child + th::after ,
table[order][order-by="2"] > thead > tr > th:first-child + th + th::after {
  display: inline-block;
}
table.remove-hidden > tbody > tr.hidden-object {
  display: none;
}
td {
  white-space: nowrap;
}
table.ellipsis {
  width: 100%;
  table-layout: fixed;
  border-spacing: 0;
}
table.ellipsis > tbody > tr > td {
  padding: 0;
  overflow: hidden;
  text-overflow: ellipsis;
}
/* name */
/* name */
th:first-child {
  padding-inline-end: 2em;
}
/* size */
th:first-child + th {
  padding-inline-end: 1em;
}
td:first-child + td {
  text-align: end;
  padding-inline-end: 1em;
}
/* date */
td:first-child + td + td {
  padding-inline-start: 1em;
  padding-inline-end: .5em;
}
/* time */
td:first-child + td + td + td {
  padding-inline-start: .5em;
}
.symlink {
  font-style: italic;
}
.dir ,
.symlink ,
.file {
  margin-inline-start: 20px;
}
.dir::before ,
.file > img {
  margin-inline-end: 4px;
  margin-inline-start: -20px;
  max-width: 16px;
  max-height: 16px;
  vertical-align: middle;
}
.dir::before {
  content: url(resource://content-accessible/html/folder.png);
}
</style>
<link rel="stylesheet" media="screen, projection" type="text/css" href="chrome://global/skin/dirListing/dirListing.css">
<script type="application/javascript">
'use strict';
var gTable, gOrderBy, gTBody, gRows, gUI_showHidden;
document.addEventListener("DOMContentLoaded", function() {
  gTable = document.getElementsByTagName("table")[0];
  gTBody = gTable.tBodies[0];
  if (gTBody.rows.length < 2)
    return;
  gUI_showHidden = document.getElementById("UI_showHidden");
  var headCells = gTable.tHead.rows[0].cells,
      hiddenObjects = false;
  function rowAction(i) {
    return function(event) {
      event.preventDefault();
      orderBy(i);
    }
  }
  for (var i = headCells.length - 1; i >= 0; i--) {
    var anchor = document.createElement("a");
    anchor.href = "";
    anchor.appendChild(headCells[i].firstChild);
    headCells[i].appendChild(anchor);
    headCells[i].addEventListener("click", rowAction(i), true);
  }
  if (gUI_showHidden) {
    gRows = Array.from(gTBody.rows);
    hiddenObjects = gRows.some(row => row.className == "hidden-object");
  }
  gTable.setAttribute("order", "");
  if (hiddenObjects) {
    gUI_showHidden.style.display = "block";
    updateHidden();
  }
}, "false");
function compareRows(rowA, rowB) {
  var a = rowA.cells[gOrderBy].getAttribute("sortable-data") || "";
  var b = rowB.cells[gOrderBy].getAttribute("sortable-data") || "";
  var intA = +a;
  var intB = +b;
  if (a == intA && b == intB) {
    a = intA;
    b = intB;
  } else {
    a = a.toLowerCase();
    b = b.toLowerCase();
  }
  if (a < b)
    return -1;
  if (a > b)
    return 1;
  return 0;
}
function orderBy(column) {
  if (!gRows)
    gRows = Array.from(gTBody.rows);
  var order;
  if (gOrderBy == column) {
    order = gTable.getAttribute("order") == "asc" ? "desc" : "asc";
  } else {
    order = "asc";
    gOrderBy = column;
    gTable.setAttribute("order-by", column);
    gRows.sort(compareRows);
  }
  gTable.removeChild(gTBody);
  gTable.setAttribute("order", order);
  if (order == "asc")
    for (var i = 0; i < gRows.length; i++)
      gTBody.appendChild(gRows[i]);
  else
    for (var i = gRows.length - 1; i >= 0; i--)
      gTBody.appendChild(gRows[i]);
  gTable.appendChild(gTBody);
}
function updateHidden() {
  gTable.className = gUI_showHidden.getElementsByTagName("input")[0].checked ?
                     "" :
                     "remove-hidden";
}
</script>
