function leapyears() {
    var year = 2020;
    var num = document.getElementById("number").value;
    var count = 0;
    while (count != num) {
        year = year + 1;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            count++;
            document.write(year + "<br>");
        }
    }
}