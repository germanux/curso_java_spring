
document.getElementById("span_cookie_nom").innerHTML 
        = getCookie("nombre_busqueda"); // document.cookie
// otra_cook=asdfasdfads
//      nombre_busqueda=jaklskdf sdf
//  otra_c=jaklskdf sdf

function getCookie(cname) {
  var name = cname + "=";
  var decodedCookie = decodeURIComponent(document.cookie);
  var ca = decodedCookie.split(';');
  //"   aafdsasdf "
  for(var i = 0; i <ca.length; i++) {
    var c = ca[i].trim();
   /* while (c.charAt(0) == ' ') {
      c = c.substring(1);
    }*/
    if (c.indexOf(name) == 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}