function fun() {
    var num = document.getElementById("number").value;
    var sum = 0;
    for (var i = 1; i <= num; i++) {
        sum = sum + i;
    }
    document.write("sum of n natural numbers:" + sum);
}