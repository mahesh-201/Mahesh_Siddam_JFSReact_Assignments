function mul() {
    var num = document.getElementById("number").value;
    var sum = 0;
    for (var i = 1; i <= num; i++) {
        if (i % 3 == 0) {
            sum = sum + i;
        }
    }
    document.write("sum of n natural numbers:" + sum);
}