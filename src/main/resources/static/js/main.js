<script type="text/javascript" id="reset">
    $(function() {
        /*  Submit form using Ajax */
        $('button[type=submit]').click(function(e) {

            //Prevent default submission of form
            e.preventDefault();

            //Remove all errors
            $('input').next().remove();

            $.post({
                url : 'helloPost',
                success : function(res) {

                    if(res.validated){
                        //Set response
                        $('#resultContainer pre code').text(JSON.stringify(res.result));
                        $('#resultContainer').show();

                    } else{
                        //Set error messages
                        $.each(res.errorMessages,function(key,value){
                            $('input[name='+key+']').after('<span class="error">'+value+'</span>');
                        });
                    }
                }
            })
        });
    });
</script>