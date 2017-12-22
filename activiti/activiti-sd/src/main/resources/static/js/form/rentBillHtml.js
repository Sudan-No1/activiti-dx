
(function(){
    $(":radio[name='rentNature']").change(function(){
        if($(":radio:checked[name='yearPlan']").val() == "true"){
            //来自年度计划
            //不理解是EXCEL导入，还是数据导入
        }else {
            //非年度计划
            var charterInLabel;
            var rentNatureName;
            if($(":radio:checked[name='rentNature']").val() == "rentOut"){
                rentNatureName =
                    '<label class="col-sm-2 control-label">房屋名称</label>' +
                    '<div class="input-group col-sm-4 pull-left" style="padding: 0 15px;">' +
                    '<input type="text" class="form-control" name="Name" placeholder="房屋名称" />' +
                    '<span class="input-group-btn">' +
                    '<a class="btn btn-default" data-toggle="modal" data-target=".modal">' +
                    '<span class="glyphicon glyphicon-list"></span>' +
                    '</a></span></div><span class="emMark">*</span>';

                if($("input[name='samePositionIdle']").length != 0){
                    $("input[name='samePositionIdle']")[0].parentNode.parentNode.parentNode.parentNode.remove() ;
                    $("select[name='FollowUpMode']")[0].parentNode.parentNode.remove() ;
                }

            }else {
                rentNatureName =
                    '<label class="col-sm-2 control-label">房屋名称</label>'+
                    '<div class="col-sm-4">'+
                    '<input type="text" class="form-control" name="Name" placeholder="房屋名称" />' +
                    '</div><span class="emMark">*</span>';

                charterInLabel =
                    '<div class="form-group">' +
                    '<label class="col-sm-2 control-label">同一区域是否有闲置房屋或出租的同类房屋</label>' +
                    '<div class="col-sm-3"><div class="radio"><label>' +
                    '<input type="radio" name="samePositionIdle" value="true"  />是</label>' +
                    '</div><div class="radio"><label>' +
                    '<input type="radio" name="samePositionIdle" value="false" />否</label>' +
                    '</div></div><span class="emMark">*</span></div>' +
                    '<div class="form-group">' +
                    '<label class="col-sm-2 control-label">后续经营模式</label><div class="col-sm-4">' +
                    '<select name="FollowUpMode" class="form-control">' +
                    '<option value="0">请选择经营模式</option>' +
                    '<option value="selfSelfB">自租自营</option>' +
                    '<option value="selfOtherB">自租他营</option>' +
                    '<option value="selfSelfU">自租自用</option>' +
                    '</select></div><span class="emMark">*</span></div>';
                $("select[name='Purpose']").parent().parent().after(charterInLabel);
            }
            $("input[name='Name']").parent().parent()
                .empty()
                .append(rentNatureName);
        }
    });

    $(":radio[name='rentType']").change(function(){
        var selectLabel;

        if($(":radio:checked[name='rentType']").val() == "undefined"){

        }else if($(":radio:checked[name='rentType']").val() == "businessHall"){
            selectLabel =
                '<option value="0">请选择房屋用途</option>' +
                '<option value="newSelfSupport">新自营厅</option>' +
                '<option value="oldSelfSupport">非新自营厅</option>';
        }else if($(":radio:checked[name='rentType']").val() == "nonBusinessHall"){
            selectLabel =
                '<option value="0">请选择房屋用途</option>' +
                '<option value="IDC">IDC机房</option>' +
                '<option value="productNonIDC">非IDC生产性用房</option>' +
                '<option value="officeNonIDC">非IDC办公后勤用房</option>';
            }
        $("select[name='Purpose']").empty().append(selectLabel);
    });

})();

/*modal*/
















