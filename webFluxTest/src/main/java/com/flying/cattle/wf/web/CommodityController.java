package com.flying.cattle.wf.web;

import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flying.cattle.wf.aid.AbstractController;
import com.flying.cattle.wf.entity.Commodity;
import com.flying.cattle.wf.service.CommodityService;
import com.flying.cattle.wf.utils.ValidationResult;
import com.flying.cattle.wf.utils.ValidationUtils;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/commodity")
public class CommodityController extends AbstractController<CommodityService, Commodity> {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/add")
	public Mono<Commodity> add() throws Exception {
		Commodity obj = new Commodity();
		Long id=super.getAutoIncrementId(obj);
		obj.setId(id);
		obj.setShopId(1l);
		obj.setName("第" + id + "个商品");
		obj.setDetails("流式商品展示");
		obj.setImageUrl("/aa/aa.png");
		obj.setPcs(1);
		obj.setPrice(new BigDecimal(998));
		obj.setType(1);

		ValidationResult vr = ValidationUtils.validateEntity(obj);
		if (!vr.isHasErrors()) {
			return baseService.insert(obj);
		} else {
			throw new Exception(vr.getFirstErrors());
		}
	}
}
