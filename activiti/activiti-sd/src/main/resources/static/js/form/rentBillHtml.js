
(function(){
    $(":radio[name='RentNature']").change(function(){
        /*if($(":radio:checked[name='RentPlan']").val() == "true"){
            //来自年度计划
            //不理解是EXCEL导入，还是数据导入
        }else {*/
            //非年度计划
            var charterInLabel;
            var rentNatureName;
            if($(":radio:checked[name='RentNature']").val() == "租出"){
                rentNatureName =
                    '<label class="col-sm-2 control-label">房屋名称</label>' +
                    '<div class="input-group col-sm-4 pull-left" style="padding: 0 15px;">' +
                    '<input type="text" class="form-control" name="RoomName" placeholder="房屋名称" />' +
                    '<span class="input-group-btn">' +
                    '<a class="btn btn-default" data-toggle="modal" data-target=".modal">' +
                    '<span class="glyphicon glyphicon-list"></span>' +
                    '</a></span></div><span class="emMark">*</span>';

                if($("input[name='HasRoom']").length != 0){
                    $("input[name='HasRoom']")[0].parentNode.parentNode.parentNode.parentNode.remove() ;
                    $("select[name='BusinessModel']")[0].parentNode.parentNode.remove() ;
                }

            }else {
                rentNatureName =
                    '<label class="col-sm-2 control-label">房屋名称</label>'+
                    '<div class="col-sm-4">'+
                    '<input type="text" class="form-control" name="RoomName" placeholder="房屋名称" />' +
                    '</div><span class="emMark">*</span>';

                charterInLabel =
                    '<div class="form-group">' +
                    '<label class="col-sm-2 control-label">同一区域是否有闲置房屋或出租的同类房屋</label>' +
                    '<div class="col-sm-3"><div class="radio"><label>' +
                    '<input type="radio" name="HasRoom" value="true"  />是</label>' +
                    '</div><div class="radio"><label>' +
                    '<input type="radio" name="HasRoom" value="false" />否</label>' +
                    '</div></div><span class="emMark">*</span></div>' +
                    '<div class="form-group">' +
                    '<label class="col-sm-2 control-label">后续经营模式</label><div class="col-sm-4">' +
                    '<select name="BusinessModel" class="form-control">' +
                    '<option value="0">请选择经营模式</option>' +
                    '<option value="自租自营">自租自营</option>' +
                    '<option value="自租他营">自租他营</option>' +
                    '<option value="自租自用">自租自用</option>' +
                    '</select></div><span class="emMark">*</span></div>';
                $("select[name='RoomPurpose']").parent().parent().after(charterInLabel);
            }
            $("input[name='RoomName']").parent().parent()
                .empty()
                .append(rentNatureName);
//        }
    });

    $(":radio[name='classification']").change(function(){
        var selectLabel;

        if($(":radio:checked[name='classification']").val() == "undefined"){

        }else if($(":radio:checked[name='classification']").val() == "营业厅"){
            selectLabel =
                '<option value="0">请选择房屋用途</option>' +
                '<option value="新自营厅">新自营厅</option>' +
                '<option value="非新自营厅">非新自营厅</option>';
        }else if($(":radio:checked[name='classification']").val() == "非营业厅"){
            selectLabel =
                '<option value="0">请选择房屋用途</option>' +
                '<option value="IDC">IDC机房</option>' +
                '<option value="非IDC生产性用房">非IDC生产性用房</option>' +
                '<option value="非IDC办公后勤用房">非IDC办公后勤用房</option>';
            }
        $("select[name='RoomPurpose']").empty().append(selectLabel);
    });

})();

/*modal*/
















