<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>新增宠物</title>
</head>
<script src="../static/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        alert(123);
    });
    function yz() {
        var petName = $(".petName").val();
        var petBreed = $(".petBreed").val();
        var birthday = $(".birthday").val();
        var description = $(".description").val();
        var reg = /^\d\d\d\d-\d\d-\d\d$/;

        if (petName == "") {
            alert("名称不能为空！");
            return false;
        }
        if (petBreed == 0) {
            alert("请选择种类");
            return false;
        }
        if (birthday == "") {
            alert("生日不能为空！");
            return false;
        } else if (reg.test(birthday) == false) {
            alert("请按照标准格式输入！");
            return false;
        }
        if (description == "") {
            alert("描述不能为空！");
            return false;
        }
    }
</script>
<body>
<form method="get" onsubmit="return yz()" action="/add">
    <input type="hidden" value="${cid}">
    <div align="center">
        <table border="1px black solid;" style="width:500px; text-align: center;" class="table">
            <tr>
                <td colspan="2"><h1>增加宠物</h1></td>
            </tr>
            <tr>
                <td>昵称</td>
                <td><input name="petName" class="petName" type="text"></td>
            </tr>
            <tr>
                <td>品种</td>
                <td><select name="petBreed" class="petBreed">
                    <option value="0">请选择</option>
                    <option value="柯基">柯基</option>
                    <option value="哈士奇">哈士奇</option>
                    <option value="柴犬">柴犬</option>
                    <option value="阿拉斯加">阿拉斯加</option>
                    <option value="杜宾">杜宾</option>
                </select></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" value="雄" name="petSex" checked>雄 <input type="radio" value="雌" name="petSex">雌
                </td>
            </tr>
            <td>出生日期</td>
            <td><input type="text" name="birthday" class="birthday">yyyy-MM-dd</td>
            </tr>
            </tr>
            <td>宠物描述</td>
            <td><textarea rows="5" cols="20" name="description" class="description"></textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交">&nbsp;
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>