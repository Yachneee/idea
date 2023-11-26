function send() {
    // xhr
    // let xhr = new XMLHttpRequest()
    // xhr.open("GET", "http://localhost:8080/list", true)
    // xhr.send()
    // xhr.onreadystatechange = () => {
    //     if (xhr.readyState === 4 && xhr.status === 200) {
    //         console.log(xhr.responseText)
    //         let result=JSON.parse(xhr.responseText);
    //         document.write(result.msg+"<br>")
    //         let d=result.data;
    //         document.write("<p> id name regionId </p>")
    //         for (let i in d) {
    //             document.write("<p>"+d[i].id+"&nbsp"+d[i].name+"&nbsp"+d[i].regionId+"</p>")
    //         }
    //         // return xhr.responseText
    //     }
    // }
    //ajax
    // $.ajax({
    //     url: "http://localhost:8080/list",
    //     type: "get",
    //     dataType: "text",
    //     success: function (data, status, xhr) {
    //         console.log(data)
    //         //data是一个字符串JSON
    //         let result=JSON.parse(data);
    //         document.write(result.msg+"<br>")
    //         let d=result.data;
    //         document.write("<p> id name regionId </p>")
    //         for (let i in d) {
    //             document.write("<p>"+d[i].id+"&nbsp"+d[i].name+"&nbsp"+d[i].regionId+"</p>")
    //         }
    //     },
    //     error: (error) => {
    //         // 请求失败回调
    //         console.log(error)
    //     },
    //     complete: (xhr, status) => {
    //         // 不管请求成功还是失败都会执行
    //         console.log(xhr.readyState)
    //     }
    // })
    //fetch
    // fetch("http://localhost:8080/list").then((resp) => {
    //     return resp.json()
    // }).then((res) => {
    //     console.log(res)
    //     //res是一个对象
    //     document.write(res.msg + "<br>")
    //     let d = res.data;
    //     document.write("<p> id name regionId </p>")
    //     for (let i in d) {
    //         document.write("<p>" + d[i].id + "&nbsp" + d[i].name + "&nbsp" + d[i].regionId + "</p>")
    //     }
    // }).catch((error) => {
    //     console.log(error)
    // })
    //axios
    axios.get("http://localhost:8080/list")
        .then((res)=> {
            // 请求成功后执行的代码
            // res是一个对象response
            let result=res.data;
            document.write(result.msg + "<br>")
            let d = result.data;
            document.write("<p> id name regionId </p>")
            for (let i in d) {
                document.write("<p>" + d[i].id + "&nbsp" + d[i].name + "&nbsp" + d[i].regionId + "</p>")
            }
        })
        .catch(function (error) {
            // 请求失败后执行的代码
            console.log(error);
        })
        .then(function() {
            console.log("总是会执行");
            // 总是在请求完成后执行，无论请求成功还是失败
        });
}