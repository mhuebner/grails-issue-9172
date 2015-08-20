<html>
<body>
<g:form action="update" name="update">
    <sec:csrfToken />
    <f:with bean="widget">
        <g:hiddenField name="_method" value="PUT"/>
        <g:hiddenField name="version" value="${widget.version}"/>
        <g:hiddenField name="id" value="${widget.id}"/>
        <f:field property="name">
            <g:textField name="${property}" value="${value}"/>
        </f:field>
        <g:submitButton name="update" value="Update"/>
    </f:with>
</g:form>
</body>
</html>
