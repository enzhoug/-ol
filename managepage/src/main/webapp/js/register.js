//提示
var notice=document.getElementById("notic");

    var noticevalue=notice.value;
    //console.log(noticevalue);
    //alert(noticevalue);
    if (noticevalue==1){
        alert("注册成功，请前去登录");

    }else if(noticevalue==3){
        alert("该用户已存在，请前去登录");
    }else{}

//用户名信息
var username = document.getElementById("username1");
username.onblur=user;
function user(){
    var namevalue = username.value.trim();
    //alert(namevalue);
    //判断输入长度
    if(namevalue.length>=4&&namevalue.length<=12){
        document.getElementById("username_err").style.display="none";
        return true;
    }else{
        document.getElementById("username_err").style.display="";
        return false;
    }
}
//密码信息
var password=document.getElementById("password1");
password.onblur=pass1;
function pass1(){
    var passvalue=password.value.trim();
    if(passvalue.length>=6&&passvalue.length<=12){
        document.getElementById("password_err").style.display="none";
        return true;
    }else{
        document.getElementById("password_err").style.display="";
        return false;
    }
}
//确认密码信息
var password2=document.getElementById("tel");
password2.onblur=pass2;
function pass2(){
    var passvalue2=password2.value.trim();
    if(passvalue2.length>=6&&passvalue2.length<=12){
        document.getElementById("tel_err").style.display="none";
        if(passvalue2 == password.value.trim()){
            document.getElementById("password_err2").style.display="none";
            return true;
        }else{
            document.getElementById("password_err2").style.display="";
        }
    }else{
        document.getElementById("tel_err").style.display="";
    }
    return false;
}
//表单提交信息
var sub=document.getElementById("reg-form");
sub.onsubmit=function(){
    if(user()&&pass1()&&pass2()){

        return true;
    }else{
        return false;
    }
}