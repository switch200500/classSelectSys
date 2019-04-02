
///检测手机号/座机号
var validateTel = (rule, value, callback) => {
    //座机
    var isPhone = /^([0-9]{3,4}-)?[0-9]{7,8}$/;
    //手机
    var isMob=/^((\+?86)|(\(\+86\)))?(13[012356789][0-9]{8}|15[012356789][0-9]{8}|18[02356789][0-9]{8}|147[0-9]{8}|1349[0-9]{7})$/;
    //var re= /^((13[0-9])|(15[^4,\\D])|(14[57])|(17[0-9])|(18[0,0-9]))\\d{8}$/
    setTimeout(() => {
        if (value!=""&&!isPhone.test(value)&&!isMob.test(value)) {
            callback(new Error('号码格式不正确'));
        } else {
            callback();
        }
    }, 1000);
};

///检测邮箱
var validateEmail = (rule, value, callback) => {
    var re= /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/
    setTimeout(() => {
        if (value!=""&&!re.test(value)) {
            callback(new Error('邮箱格式不正确'));
        } else {
            callback();
        }
    }, 1000);
};

//ajax后台交互
function handleData(url,data,successFunction){
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型例"POST"
        dataType: "json",//预期服务器返回的数据类型
        url: url,//url，后台调用的
        data: data,
        success: successFunction,
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            console.log('网络异常！尝试刷新网页解决问题');
            console.log('XMLHttpRequest:');
            console.log(XMLHttpRequest);
        }
    });
    /*$.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/handle_login",//url
        data: {
            'Sno': a.Sno,
            'password': a.password
        },
        success: function (result) {
            console.log(result);//打印服务端返回的数据(调试用)
            if (result) {
                th.alertMessage('登陆成功','success');
                //sessionStorage也可存储Json对象：存储时，通过JSON.stringify()将对象转换为文本格式；
                // 读取时，通过JSON.parse()将文本转换回对象。
                sessionStorage.setItem('userMessage', JSON.stringify(a));
                window.location.href='./util';
            }else{
                th.alertMessage('用户名或密码错误','error');
                a.password = '';
                ref.clearPass.focus();
            }

        },
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            th.alertMessage('登录失败','error');
            console.log('网络异常！尝试刷新网页解决问题');
            console.log('XMLHttpRequest:');
            console.log(XMLHttpRequest);
        }
    });*/

}

//检查是否登录
function checkLog(){
    var a = sessionStorage.getItem('userMessage');
    //console.log(JSON.parse(a));
    if(!a){
        //alert("请先登录");
        window.location.href='./login';
    }else{
        return JSON.parse(a).Sno;
    }
}
//计算学期
function getTerm(no){
    let date=new Date;
    let startYear = parseInt(no.toString().slice(0, 4));
    let year=date.getFullYear();
    let month=date.getMonth()+1;    ////获取当前月份(0-11,0代表1月)
    let term = (year - startYear)*2 + parseInt(month/9);
    let yTermValue = year - startYear + parseInt(month/9);
    console.log(year+'年'+month+'月第'+ term+'学期');

    let termYear ={
        term: term, //学期，
        year: startYear,    //开学年份
        now: year,  //现在年份
        yTermValue: yTermValue  //选择的年度
    };
    return termYear;
}

//弹出信息
function alertMessage(th,action,a){
    var msg,type;
    switch(a){
        case '1':
            type='success';
            msg = action+'成功';
            break;
        case '2':
            type='warning';
            msg = action;
            break;
        case '3':
            type='info';
            msg = '取消'+action;
            break;
        case '4':
            type='error';
            msg = action+'失败';
            break;
        default:
            break;
    }
    th.$message({
        message: msg,
        type: type,
    });
}



