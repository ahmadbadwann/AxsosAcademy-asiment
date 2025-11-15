<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 11/10/2025
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
    <h1 class="text-center mt-[3%]">sent an Omikuji!</h1>
    <form action="/supmit" method="POST" class="flex justify-center mt-[3%] border-[2%] border-black w-1/2 mx-auto">
        <div class="mt-[3%] w-[100%]">
            <div class="flex justify-between mt-[2%]">
                <label for=""> pick any number  from 5 to 25 </label>
                <input type="number" name="number" class="mt-[2%] border-[2px] border-black">
            </div>
            <div class="flex justify-between mt-[2%]">
                <label for="">pick any number from  5 to 25 </label>
                <input type="number" name="number" class="mt-[2%] border-[2px] border-black">
            </div>
            <div class="flex justify-between mt-[2%]">
                <label for="">enter the name of any real person</label>
                <input type="text" name="person" class="mt-[2%] border-[2px] border-black">
            </div>
            <div class="flex justify-between mt-[2%]">
                <label for="">enter professional endeavor or hobby </label>
                <input type="text" name="hobby" class="mt-[2%] border-[2px] border-black">
            </div>
            <div class="flex justify-between mt-[2%]">
                <label for="">enter any type of living thing  </label>
                <input type="text" name="living" class="mt-[2%] border-[2px] border-black">
            </div>
            <div class="flex justify-between mt-[2%]">
                <label for="">say something nice to someone </label>
                <input type="text" name="nice" class="mt-[2%] border-[2px] border-black">
            </div>
            <div class="flex justify-between mt-[2%]">
                <label for="">send any show a frinde</label>
                <input type="submit" value="submit" class="mt-[2%] border-[2px] border-black p-1">
            </div>
        </div>
    </form>
</body>
</html>
