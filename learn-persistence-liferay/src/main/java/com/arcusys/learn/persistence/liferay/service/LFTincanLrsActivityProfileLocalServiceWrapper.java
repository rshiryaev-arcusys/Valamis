package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LFTincanLrsActivityProfileLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsActivityProfileLocalService
 * @generated
 */
public class LFTincanLrsActivityProfileLocalServiceWrapper
    implements LFTincanLrsActivityProfileLocalService,
        ServiceWrapper<LFTincanLrsActivityProfileLocalService> {
    private LFTincanLrsActivityProfileLocalService _lfTincanLrsActivityProfileLocalService;

    public LFTincanLrsActivityProfileLocalServiceWrapper(
        LFTincanLrsActivityProfileLocalService lfTincanLrsActivityProfileLocalService) {
        _lfTincanLrsActivityProfileLocalService = lfTincanLrsActivityProfileLocalService;
    }

    /**
    * Adds the l f tincan lrs activity profile to the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsActivityProfile the l f tincan lrs activity profile
    * @return the l f tincan lrs activity profile that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile addLFTincanLrsActivityProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile lfTincanLrsActivityProfile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.addLFTincanLrsActivityProfile(lfTincanLrsActivityProfile);
    }

    /**
    * Creates a new l f tincan lrs activity profile with the primary key. Does not add the l f tincan lrs activity profile to the database.
    *
    * @param id the primary key for the new l f tincan lrs activity profile
    * @return the new l f tincan lrs activity profile
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile createLFTincanLrsActivityProfile(
        long id) {
        return _lfTincanLrsActivityProfileLocalService.createLFTincanLrsActivityProfile(id);
    }

    /**
    * Deletes the l f tincan lrs activity profile with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs activity profile
    * @return the l f tincan lrs activity profile that was removed
    * @throws PortalException if a l f tincan lrs activity profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile deleteLFTincanLrsActivityProfile(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.deleteLFTincanLrsActivityProfile(id);
    }

    /**
    * Deletes the l f tincan lrs activity profile from the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsActivityProfile the l f tincan lrs activity profile
    * @return the l f tincan lrs activity profile that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile deleteLFTincanLrsActivityProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile lfTincanLrsActivityProfile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.deleteLFTincanLrsActivityProfile(lfTincanLrsActivityProfile);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfTincanLrsActivityProfileLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsActivityProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsActivityProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile fetchLFTincanLrsActivityProfile(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.fetchLFTincanLrsActivityProfile(id);
    }

    /**
    * Returns the l f tincan lrs activity profile with the primary key.
    *
    * @param id the primary key of the l f tincan lrs activity profile
    * @return the l f tincan lrs activity profile
    * @throws PortalException if a l f tincan lrs activity profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile getLFTincanLrsActivityProfile(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.getLFTincanLrsActivityProfile(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f tincan lrs activity profiles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsActivityProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs activity profiles
    * @param end the upper bound of the range of l f tincan lrs activity profiles (not inclusive)
    * @return the range of l f tincan lrs activity profiles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile> getLFTincanLrsActivityProfiles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.getLFTincanLrsActivityProfiles(start,
            end);
    }

    /**
    * Returns the number of l f tincan lrs activity profiles.
    *
    * @return the number of l f tincan lrs activity profiles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLFTincanLrsActivityProfilesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.getLFTincanLrsActivityProfilesCount();
    }

    /**
    * Updates the l f tincan lrs activity profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfTincanLrsActivityProfile the l f tincan lrs activity profile
    * @return the l f tincan lrs activity profile that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile updateLFTincanLrsActivityProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile lfTincanLrsActivityProfile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.updateLFTincanLrsActivityProfile(lfTincanLrsActivityProfile);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lfTincanLrsActivityProfileLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfTincanLrsActivityProfileLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfTincanLrsActivityProfileLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile findByActivityIdAndProfileId(
        java.lang.String activityId, java.lang.String profileId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsActivityProfileException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.findByActivityIdAndProfileId(activityId,
            profileId);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile createLFTincanLrsActivityProfile(
        java.lang.String activityId, java.lang.String profileId,
        java.lang.Integer documentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfTincanLrsActivityProfileLocalService.createLFTincanLrsActivityProfile(activityId,
            profileId, documentId);
    }

    @Override
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfTincanLrsActivityProfileLocalService.removeAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LFTincanLrsActivityProfileLocalService getWrappedLFTincanLrsActivityProfileLocalService() {
        return _lfTincanLrsActivityProfileLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLFTincanLrsActivityProfileLocalService(
        LFTincanLrsActivityProfileLocalService lfTincanLrsActivityProfileLocalService) {
        _lfTincanLrsActivityProfileLocalService = lfTincanLrsActivityProfileLocalService;
    }

    @Override
    public LFTincanLrsActivityProfileLocalService getWrappedService() {
        return _lfTincanLrsActivityProfileLocalService;
    }

    @Override
    public void setWrappedService(
        LFTincanLrsActivityProfileLocalService lfTincanLrsActivityProfileLocalService) {
        _lfTincanLrsActivityProfileLocalService = lfTincanLrsActivityProfileLocalService;
    }
}