<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>INDEX</title>
</head>
<body>
<h4>팀 변경시 `개발->기획, 기획->개발`</h4>
<div class="main">
<#list members as member>
<table>
    <tr>
        <td>번호</td>
        <td>${member.idx}</td>
    </tr>
    <tr>
        <td>이름</td>
        <td>${member.name}</td>
    </tr>
    <tr>
        <td>팀 번호</td>
        <td>${member.team.idx}</td>
    </tr>
    <tr>
        <td>팀 이름</td>
        <td>${member.team.name}</td>
    </tr>
    <tr>
        <td>
            팀 변경
        </td>
        <td>
            <form name="team" action="/type/member/${member.idx}" method="post">
                <input type="hidden" name="idx" value=${member.team.reverseIdx}>
                <button data-query="out" type="submit">트랜잭션 밖에서 변경</button>
                <button data-query="in" type="submit">트랜잭션 안에서 변경</button>
            </form>
        </td>
    </tr>
</table>
</#list>
</div>
<script type="text/javascript" src="/webjars/jquery/2.2.4/jquery.min.js"></script>
<script>
$('.main').on('click', '[type=submit]', function(e){
    e.preventDefault();
    var form = this.closest('form');
    form.action = form.action.replace('/type/','/' + $(this).data('query') + '/');
    form.submit();
});
</script>
</body>
</html>