<!DOCTYPE html>

<html lang="en">

<body>
<table>
    <tr>
        <th>No</th>
        <th>TITLE</th>
        <th>CONTEXT</th>
    </tr>
    <#list resDTO.data as item>
    <tr>
        <th>${item.id}</th>
        <th>${item.title}</th>
        <th>${item.context}</th>
    </tr>
    </#list>
</table>
</body>

</html>