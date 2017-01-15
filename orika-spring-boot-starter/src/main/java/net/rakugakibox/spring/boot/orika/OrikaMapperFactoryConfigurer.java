package net.rakugakibox.spring.boot.orika;

import ma.glasnost.orika.MapperFactory;

/**
 * The configurer of {@link MapperFactory}.
 */
public interface OrikaMapperFactoryConfigurer {

    /**
     * Configures the {@link MapperFactory}.
     *
     * @param orikaMapperFactory the {@link MapperFactory}.
     */
    void configure(MapperFactory orikaMapperFactory);

}
