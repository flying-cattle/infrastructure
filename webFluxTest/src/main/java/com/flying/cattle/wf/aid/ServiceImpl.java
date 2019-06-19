package com.flying.cattle.wf.aid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p>
 * IService 实现类（ 泛型：M 是 mapper 对象，T 是实体 ， PK 是主键泛型 ）
 * </p>
 *
 * @author BianPeng
 * @since 2019/6/17
 */
public class ServiceImpl<M extends ReactiveMongoRepository<T,Long>, T> implements IService<T> {

	@Autowired
    protected M baseDao;
    
	@Override
	public Mono<T> insert(T entity) {
		return baseDao.save(entity);
	}

	@Override
	public Mono<Boolean> deleteById(Long id) {
		// TODO Auto-generated method stub
		baseDao.deleteById(id);
		return Mono.create(entityMonoSink -> entityMonoSink.success());
	}

	@Override
	public Mono<Boolean> delete(T entity) {
		// TODO Auto-generated method stub
		baseDao.delete(entity);
		return Mono.create(entityMonoSink -> entityMonoSink.success());
	}

	@Override
	public Mono<T> updateById(T entity) {
		// TODO Auto-generated method stub
		return baseDao.save(entity);
	}

	@Override
	public Mono<T> findById(Long id) {
		// TODO Auto-generated method stub
		return baseDao.findById(id);
	}

	@Override
	public Flux<T> findAll() {
		// TODO Auto-generated method stub
		return baseDao.findAll();
	}

}
